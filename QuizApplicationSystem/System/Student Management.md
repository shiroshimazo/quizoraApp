# Student Management

> Status: Planned Swing feature specification. Named classes and reuse points below are design targets, not verified existing code.

The administrator's Student Management destination provides a read-only directory
with explicit Edit and Archive actions. Only student-role accounts are listed.

## KPI definitions

| Card | Definition |
| --- | --- |
| Total Student | All student records, including archived accounts |
| Active Student | Students with is_active = TRUE and archived_at IS NULL |
| Inactive Student | Students with is_active = FALSE and archived_at IS NULL |

Archived students are separate from inactive students. Total equals active plus
inactive plus archived. Search and status filters do not change the KPI totals.

## Directory

Columns: ID, Name, Username, Email, Status, Actions.

Search matches a literal, case-insensitive substring of ID, name, username, or email.
It combines with All statuses, Active, Inactive, and Archived filters.
Column headers support sorting, except Actions. The footer shows filtered and
overall counts. Empty records, no matching records, loading, and unavailable-data
states have distinct messages. Refresh retrieves current data and preserves filters.

The initial implementation loads student projections without credentials and filters
them locally. Server-side pagination/search is deferred until dataset size requires it.

## Editing and archiving

Edit opens a modal form for name, username, email, and Active/Inactive status.
Names and usernames are required; schema length limits and email format are checked.
Usernames cannot contain whitespace. Duplicate usernames/emails are rejected across
all roles and archived accounts, including username/email cross-field collisions.
Password, role, ID, and assessment records are not editable here.

Archive requires confirmation. It sets archived_at and disables is_active without
deleting the user, attempts, answers, or results. Archived students stay in the
directory, have disabled actions, and cannot log in. Restore/unarchive and account
creation are outside this delivery.

Reads and writes verify an active, unarchived administrator in MySQL. Writes lock the
admin and student records, compare the original editable fields/state to prevent
stale overwrites, and commit atomically. Database work runs off the Swing Event Dispatch Thread (EDT).
Actions are disabled while requests run. Failures remain visible and editable forms
stay open for correction or cancellation.

## Layout

KPI cards reflow into a single column on narrow workspaces. Search/filter controls
wrap. The table keeps its headers and action columns, enabling horizontal scrolling
when minimum column widths cannot fit. The whole page scrolls vertically when needed.
Row statuses use text as well as color, and clipped identity fields have tooltips.

Use JTable with a dedicated table model, TableRowSorter for sorting/filtering, and JScrollPane. Use AUTO_RESIZE_OFF when minimum column widths require horizontal scrolling.

## Database migration

The specification expects users.archived_at. No schema dump or migration script
is present in this workspace, and the live database has not been inspected.
Before implementation, verify the schema. If the column is missing, prepare and
review an additive migration under Database/Migrations/ according to Database Rules.
Do not assume a migration has already been applied.

For application rollback, leave the additive column in place. Archived accounts keep
is_active = FALSE, which the previous login implementation understands. Do not drop
the column or reactivate archived accounts during rollback: that would discard archive
state. No destructive schema rollback is provided or executed.

## Planned verification

Implementation and tests are not present in this workspace. Before marking this
feature complete, verify authorization, data calculations, empty/error states,
Swing interactions on the EDT, responsive layout, and Navigation/logout. Use
isolated database fixtures and confirm historical records are preserved.
