## 📝 프로젝트 소개

이 프로젝트는 안드로이드 앱의 기본 구성 요소를 활용하여 사용자 친화적인 인터페이스를 구현한 예제입니다.
앱 실행 시 **스플래시(Splash) 화면**을 통해 초기 로딩 과정을 보여주고, 이어서 **사진 목록 갤러리**로 전환됩니다.
사용자는 갤러리에서 특정 사진을 선택하여 **확대된 이미지**를 자세히 볼 수 있습니다.

## ✨ 주요 기능

* **스플래시 화면**: 앱 시작 시 설정된 시간 동안 로고 또는 초기 화면을 표시합니다.
    * `android.os.Handler().postDelayed()`를 사용하여 일정 시간(3초) 후 메인 화면으로 자동 전환됩니다.
* **사진 목록 갤러리**: `LinearLayout`과 `CardView`를 조합하여 깔끔하고 정돈된 그리드 형태의 이미지 목록을 제공합니다.
    * 각 이미지는 `CardView` 내부에 배치되어 시각적인 입체감과 둥근 모서리 효과를 가집니다.
* **사진 확대 보기**: 사진 목록에서 특정 이미지를 클릭하면 해당 이미지를 확대하여 보여주는 상세 화면으로 이동합니다.
    * `Intent`의 `putExtra()`를 통해 클릭된 이미지의 ID 또는 관련 데이터를 전달하고, 상세 화면에서는 `getStringExtra()`를 통해 이를 받아와 이미지를 로드합니다.
<img width="1080" height="2400" alt="Screenshot_20250926_153134" src="https://github.com/user-attachments/assets/8d16dd0e-1f7f-4ef7-b51a-5796f75b4493" />
<img width="1080" height="2400" alt="Screenshot_20250926_152709" src="https://github.com/user-attachments/assets/7b4c28b8-c106-4d86-bae4-363c3912f76c" />
<img width="1080" height="2400" alt="Screenshot_20250926_161319" src="https://github.com/user-attachments/assets/285bdced-ff4b-418f-8ddd-89a6e92abaff" />
