# kt-train-search-demo

#### Problem Statement 
Create different arrays of trains with their Name, Source, Destination and DepartureTime,

For example: Rajdhani, Surat, Delhi, 10:30 AM. 

Now write a program that can filter train details by entering input in command-line arguments from its Name, Source, Destination, DepartureTime.

Example 1:

Input: DepartureTime 10:30

Output: will return trains which have DepartureTime 10:30AM

Example 2:

Input: Destination Delhi

Output: will return trains which have destination Delhi

#### Implementation

Store each detail as key-value pairs in a map.
 
key will be the name of train and value will be property.

apply filters on key or value and return train details by fetching it from all maps.

#### How to run

Pass input in CLI with format `filterType` `filterValue`

| filterType | filterValue |
| -------- | ------ |
| Name | `train` | 
| DepartureTime | `hh:mm` |
| Source | `city`| 
|Destination | `city`|
