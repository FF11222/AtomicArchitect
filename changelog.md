# changelog

## [1.18.2-0.0.0.0]-2025/02/24
成功完成準備工作，可以開始正式踏入開發minecraft mod的旅程

## [1.18.2-0.0.1.0]-2025/03/01
1. 建立一個測試用的 HYDROGEN ( lang 有寫但沒有 model 跟 texture )
2. 建立 AtomElement 作為所有元素的模板
3. 建立 AtomElementBuilder 作為建立 AtomElement 的工具

## [1.18.2-0.0.2.0]-2025/03/02
1. 放棄上面的方法，轉回使用正常的方法
2. 完成118個元素的建立(沒有 texture 跟 model ，有中英的 lang )
### 待解決
1. 有些中文顯示不出來(可能是編碼問題)

## [1.18.2-0.0.3.0]-2025/03/02
1. 加入 MatterDecomposerMenu, 註冊 ModMenuTypes 於 RegistryHandler

## [1.18.2-0.0.4.0]-2025/03/02
1. 加入 AlchemyTable 的 BlockEntity, Menu, Screen, 並完成註冊
### 待解決
1. 有些中文顯示不出來(可能是編碼問題)
2. 完成 MatterDecomposerMenu 與 Screen
3. 完成 AlchemyTable BlockEntity, Menu, Screen

## [1.18.2-0.0.5.0]-2025/03/11
1. 用 AlchemyTable 作為 AlchemyTableMenu 的 slot，並建立 AlchemyContainer。
2. 讓 AlchemyTable 的 gui 正常顯示
### 待解決
1. 有些中文顯示不出來(可能是編碼問題)
2. 完成 MatterDecomposerMenu 與 Screen
3. 完成 AlchemyTable BlockEntity, Menu, Screen
4. 實現放置物品到 AlchemyTable 上