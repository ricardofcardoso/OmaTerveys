# 🩺 OmaTerveys – Personal Health Tracker App

A modern Android app built with **Kotlin**, **Jetpack Compose**, **Room**, **Flow**, and **Coroutines**.  
Inspired by Mehiläinen’s OmaMehiläinen, it allows users to track mood, sleep, exercise, and health notes in a secure and user-friendly way.

---

## 🚀 Features

✅ Jetpack Compose UI (Material 3)  
✅ Log and view daily health metrics  
✅ Offline data with Room + Flow  
✅ MVVM architecture with Hilt DI  
✅ Compose-friendly state management  
✅ Accessible UI (screen reader & font scaling support)  
✅ Modular, testable codebase

---

## 🧠 Tech Stack

| Layer         | Tools                                                                 |
|---------------|-----------------------------------------------------------------------|
| Language      | Kotlin                                                                |
| UI            | Jetpack Compose, Material 3                                           |
| Architecture  | MVVM + Clean Architecture principles                                  |
| State Mgmt    | StateFlow, ViewModel, Compose State                                   |
| Database      | Room with Flow                                                        |
| Async         | Kotlin Coroutines                                                     |
| DI            | Hilt                                                                  |
| Testing       | (Planned) Espresso, JUnit                                             |

---

## 📦 Requirements

- Android Studio Hedgehog or newer
- Kotlin 2.0+
- Min SDK 24+
- Gradle 8.0+

---

## ▶️ Getting Started

1. Clone this repository:
   ```bash
   git clone https://github.com/ricardofcardoso/OmaTerveys.git
   cd OmaTerveys
   
2. Open in Android Studio
3. Sync Gradle
4. Run the app on an emulator or device

---

## 🛡️ Accessibility & Security

- Compose UI designed to support screen readers (TalkBack)
- Supports font scaling for visually impaired users
- Notes are stored locally via Room – sensitive data will later use encrypted preferences

---

## 📌 Planned Features
- Add/Edit entry screen
- Graph visualizations (mood/sleep trends)
- Export/share health logs
- Unit tests & UI tests
- Encrypted storage for notes
- Dark mode toggle

---

## 👤 About Me
I'm a Kotlin Android developer based in Portugal, currently relocating to Finland. I'm passionate about building apps that help people — both in everyday life and in healthcare contexts. This project is part of my application to join the OmaMehiläinen team at Mehiläinen.

---

## 📬 Contact
- LinkedIn: https://www.linkedin.com/in/ricardofcardoso4/
- GitHub: @ricardofcardoso
- Email: ricardofcardoso4@gmail.com
