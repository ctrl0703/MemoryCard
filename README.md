# MemoryCard

## 1차 요구사항
1. 등록된 카드 목록을 볼 수 있다.
2. 카드를 선택하면 등록되어있는 단어 목록을 볼 수 있다.
3. 암기 시작 버튼을 누르면 단어가 무작위 순서로 하나씩 표시된다.
4. 단어마다 암기/미암기 버튼을 눌르면 다음 단어가 표시되고, 마지막 단어가 끝나면 현황을 보여준다.(저장 가능)
5. 단어 자체를 누르면 의미를 보여준다.(toggle)

```
GET /cards
GET /cards/{cardId}/words
GET /cards/{cardId}/random
PUT /cards/{cardId}
```
