
# DukePro, the bro
## User Guide
## Features 

### Add Tasks

Add 3 types: To-Do, Event, Deadline; each with different information and details you can add. 

Tasks are saved in hard drive, so you can access it at later starting of application.

### Mark/ Unmark tasks

Mark/ Unmark tasks that have been done/ incomplete.

### Delete tasks

Delete unwanted tasks from Task List.

### List Tasks

List out all tasks in Task List.

## Usage

### `todo` - Add 'todo' task

Adds todo task to TaskList, stored in hard drive.

Example of usage: 

`todo (sample)`

Expected outcome:

Adds todo task to TaskList in hard drive, along with confirmation message.

```
Got it. I've added this task:
[T][ ] (sample)
Now you have (n) tasks in the list.
```


### `event` - Add 'event' task

Adds event task to TaskList, stored in hard drive.

Example of usage:

`event (sample) /at yyyy-MM-dd`

Expected outcome:

Adds event task to TaskList in hard drive, along with confirmation message.

```
Got it. I've added this task:
[T][ ] (sample) (at: MMM dd yyyy)
Now you have (n) tasks in the list.
```


### `deadline` - Add 'deadline' task

Adds deadline task to TaskList, stored in hard drive.

Example of usage:

`deadline (sample) /by yyyy-MM-dd`

Expected outcome:

Adds deadline task to TaskList in hard drive, along with confirmation message.

```
Got it. I've added this task:
[T][ ] (sample) (by: MMM dd yyyy)
Now you have (n) tasks in the list.
```

### `delete` - Delete task in list

Deletes a task from Task List, by its index.

Example of usage:

`delete (index)`

Expected outcome:

Deletes task at index (index) on TaskList.
```
Noted. I've removed this task:
[T][ ] (sample)
Now you have (n) tasks in the list.
```

### `mark` - Mark task in list

Mark a task from Task List, by its index.

Example of usage:

`mark (index)`

Expected outcome:

Marks task at index (index) on TaskList.
```
Nice! I've marked this task as done:
[T][ ] (sample)
```

### `unmark` - Unmark task in list

Unmark a task from Task List, by its index.

Example of usage:

`unmark (index)`

Expected outcome:

Unmarks task at index (index) on TaskList.
```
Okay, I've marked this task as not done yet:
[T][ ] (sample)
```


### `list` - Lists all tasks in Task List

Lists all tasks accumulated since first use. Made possible by saving onto hard drive.

Example of usage:

`list`

Expected outcome:

Lists all tasks accumulated since first use.
```
Here are the tasks in your list:
1. [T][X] borrow books
2. [T][ ] internship practice
```