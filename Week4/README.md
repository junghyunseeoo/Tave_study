# 🎵 Musician Catalog App (가수 카탈로그 앱)

이 프로젝트는 안드로이드 앱 개발의 핵심 요소인 **화면 이동(Navigation)**과 **데이터 목록 표시($\text{RecyclerView}$)**를 통합적으로 학습하고 구현하는 것을 목표로 합니다.

## 🌟 프로젝트 주요 목표 및 학습 내용

| 분류 | 세부 학습 항목 | 목표 및 구현 내용 |
| :---: | :--- | :--- |
| **UI/UX 핵심** | **`RecyclerView` 개념 및 사용법 익히기** | 방대한 데이터를 효율적으로 스크롤 가능한 목록으로 표시하기 위한 핵심 원리 (`ViewHolder`, `Adapter`, `LayoutManager`)를 완벽히 이해하고 구현. |
| **화면 이동** | **`Navigation Component` 활용** | `Fragment` 간의 안전하고 명확한 이동 경로를 정의하고 구현하며, 데이터 (`Args`)를 안전하게 전달. |
| **데이터 구조** | **가수별 노래 목록 표시** | `RecyclerView`를 사용하여 특정 가수 정보 (`Fragment`) 내에 해당 가수의 노래 목록을 수직 또는 수평 리스트로 표시하여 구현 완료. |
| **이벤트 처리** | **사진 클릭 시 화면 전환 구현** | 초기 화면의 가수 사진 (`ImageView` 등) 클릭 이벤트를 감지하고, **`Navigation`**을 사용하여 노래 목록 `Fragment`로 **안전하게 이동** 및 데이터 전달 로직 구현. |

## 🛠️ 사용된 주요 기술 및 컴포넌트

* **언어:** Kotlin
* **개발 환경:** Android Studio
* **핵심 라이브러리:**
    * `Navigation Component`: 화면 간의 이동 관리
    * `RecyclerView`: 데이터 리스트 표시
    * `Fragment`: 모듈화된 UI 구현
