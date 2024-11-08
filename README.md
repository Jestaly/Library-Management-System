# Library-Management-System
Library Management Made in Java

Flowchart
|
Start
│
├── Book Management ────┬──── Add Book ────→ Store in Database
│                       ├──── Update Book ─→ Update in Database
│                       └──── Remove Book ─→ Remove from Database
│
├── Member Management ──┬──── Add Member ──→ Store in Database
│                       ├──── Update Member → Update in Database
│                       └──── Remove Member → Remove from Database
│
├── Catalog Search ────→ Search Criteria (Title, Author, ISBN, Genre)
│                       └──── Display Search Results → View Availability
│
├── Book Issue and Return ──┬──── Issue Book ──→ Update Book Status to "Borrowed"
│                           └──── Return Book ─→ Calculate Fine (if overdue)
│                                                 └→ Update Book Status to "Available"
│
├── Fine Calculation and Collection ──→ Calculate Fine for Overdue
│                                      └── Accept Payment → Update Member Record
│
├── Inventory Management ──→ Track Number of Copies ──→ Update Inventory
│                           └── Generate Inventory Reports
│
├── Reservation Management ──→ Reserve Book ──→ Notify When Available
│
├── Reports and Analytics ──→ Generate Reports (e.g., Popular Titles, Overdue Books)
│
├── Notifications ──→ Send Notification (Due Dates, Reservations, etc.)
│
└── User Authentication and Role Management ───→ Verify Role ───→ Access Based on Role
                                                         │
                                                         └── End
