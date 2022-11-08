# smart-device-cli

### TODO

- [x] Add command `create`
- [x] Ask user for the fields of this new device
- [x] The user can create 2 types of device: `SmartWatch` or `SmartPhone`
- [x] At the end show the user the created device.
- [x] Store created device in one Array
____
- [ ] Add command `list` with the next options:
    - [ ]  `list all smart-watches` > log with the list of smart watches
    - [ ]  `list all smart-phones` > log with the list of smart phones
    - [ ]  `list rm smart-phone 0` giving the position of the array remove one element of the list of smart watches or smart phones. IMPORTANT: IF THE ARRAY IS EMPTY use `LOG.warn()` to warn the user and ignore the command
    - [ ]  clear the lists/remove all the items of the list (`list clear smart-phones` or `list clear smart-watches`)
- [ ] Create new service (as well as `CreateDeviceService`) but for the case to manage the lists of the smart devices:
    - [ ] Name of the new service `ListDeviceService`
    - [ ] Same structure as the `CreateDeviceService` > public `init()` method, rest of the functions `private`
    - [ ] Move the list of `CreateDeviceService` to this new service, also create the functions to add the created smartphones and smartwatches
___