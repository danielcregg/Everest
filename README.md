# Everest

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-007396?style=flat-square&logo=java&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white)
![License: Apache 2.0](https://img.shields.io/badge/License-Apache%202.0-blue.svg?style=flat-square)
![Last Commit](https://img.shields.io/github/last-commit/danielcregg/Everest?style=flat-square)

> **Note:** This repository is a fork of [RohitAwate/Everest](https://github.com/RohitAwate/Everest).

A beautiful, cross-platform REST API testing client built with JavaFX. Everest (formerly RESTaurant) provides a lightweight, native alternative to Electron-based API clients like Postman, with a gorgeous flat design and comprehensive request-building capabilities.

![home](https://user-images.githubusercontent.com/23148259/45769743-23e5a380-bc5e-11e8-9e45-5ea50342c19f.PNG)

## Features

- **HTTP Methods** -- GET, POST, PUT, DELETE, and PATCH requests
- **Request Builder** -- Headers, query parameters (with live preview), syntax highlighting for JSON/XML, URL-encoded and multipart-form bodies
- **Response Viewer** -- Status code, content type, elapsed time, body size, JSON visualizer, and response headers
- **API Authentication** -- Basic Auth and Digest Auth
- **Custom Themes** -- Fully themeable via CSS ([theme guide](THEMES.md))
- **Multi-Tabbing** -- Efficient pseudo tab-switching for low memory footprint
- **Request History** -- Searchable history with intelligent ranking

![get](https://user-images.githubusercontent.com/23148259/45769777-3c55be00-bc5e-11e8-9fbc-c8bf93b7dc5d.gif)

## Prerequisites

- **JDK 8** (JDK 9 also supported; JDK 10+ requires separate JavaFX installation)
- **Maven**
- **Git**

> If using OpenJDK, install OpenJFX separately.

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/danielcregg/Everest.git
   cd Everest
   ```

2. Build the project:
   ```bash
   mvn package
   ```

3. Run the application:
   ```bash
   mvn exec:java
   ```

## Keyboard Shortcuts

| Shortcut     | Action                   |
|--------------|--------------------------|
| Ctrl + T     | New Tab                  |
| Ctrl + W     | Close Tab                |
| Ctrl + H     | Toggle History           |
| Ctrl + Enter | Send Request             |
| Ctrl + L     | Focus Address Bar        |
| Ctrl + M     | Select HTTP Method       |
| Ctrl + F     | Focus History Search Bar |
| Alt + P      | Focus Query Params Tab   |
| Alt + A      | Focus Authentication Tab |
| Alt + H      | Focus Headers Tab        |
| Alt + B      | Focus Body Tab           |

## License

This project is licensed under the [Apache License 2.0](LICENSE).

## Acknowledgements

Originally created by [Rohit Awate](https://github.com/RohitAwate). See [CONTRIBUTING.md](CONTRIBUTING.md) for contribution guidelines.
