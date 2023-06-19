# Grass Keeper

# A client software reimplementation for a certain anime game.

# Current Version: 3.4 (Will not update probably.)

# What is the meaning of this?
## Chat/GM Bot.

# Implemented features:
 - [x] 1.Login
 - [x] 2.Recieve private/channel message
 - [x] 3.Send private/channel message
 - [x] 4.Listen world/home enter request
 - [x] 5.Deal world/home enter request
 - [x] 6.Listen friend add request
 - [x] 7.Deal friend add request
 - [x] 8.Delete friend
 - [x] 9.Add friend
 - [x] 10.Get friend list
 - [ ] 11.Will not support other features

# How to build?
```bash
bash gradlew jar
#the jar file will be found in app/build/libs/
```

# How to run?
```bash
java -jar app-all.jar
```

# Simple guide
## Download prebuilt jar from release.
## The software needs user.json and client.json,download it from release and modify them.
## Run it by java -jar app-all.jar
## Use commands to login or enable plugins


# Commands
```bash
login: login the account.
logout: logout the account.
plugin:
    -l|--list: show all loaded plugin
    -e|--enable: enable a plugin
    -d|--disable: disable a plugin
    -n|--name: specify a plugin name
    -r|--refresh: reload all plugin
friend:
    -l|--list: show all friends
    -d|--delete: delete a friend
    -a|--add: add a friend
    -r|--refresh: refresh all friend
```

# Plugin system:
## app will not have any ability to process messages/events without plugins
## plugins should be placed under "plugin" folder
## if you have no idea about programing,just use plugins that someone else crafted.
## for programers: In order to create a plugin,you will need to add sdk.jar into the dependencies.All dependencies except sdk.jar should be packed into plugin's jar.Plugin's class must be defined as "com.robot.Main"


# Used libraries
## [Sorapointa-Protos](https://github.com/Sorapointa/Sorapointa-Protos): Protobuf
## [Aspex](https://github.com/Saint-Theana/ASPEX): Protobuf Encoder/Decoder
## [IOSTerm-X](https://github.com/Saint-Theana/IOSTerm-X): Terminal Interface
## [kcp-netty](https://github.com/szhnet/kcp-netty): Kcp Client
## [netty](https://github.com/netty/netty): Network Framework



## License
```
Copyright (C) 2023  Saint-Theana

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
USA

Please contact Saint-Theana by email the.winter.will.come@gmail.com if you need
additional information or have any questions
```