/ **
 *项目：Bootstrap Hover下拉列表
 *作者：金马伦矛
 *贡献者：Mattia Larentis
 *
 *依赖关系：Bootstrap的Dropdown插件，jQuery
 *
 *一个简单的插件，可使Bootstrap下拉菜单在悬停时激活，并提供良好的用户体验。
 *
 *许可证：麻省理工学院
 *
 * http://cameronspear.com/blog/bootstrap-dropdown-on-hover-plugin/
 * /（function（e，t，n）{var r = e（）; e.fn.dropdownHover = function（n）{if（document中的“ ontouchstart”）返回此值； r = r.add（this.parent （））;返回this.each（function（）{function h（e）{r.find（“：focus”）。blur（）; l.instantlyCloseOthers ===！0 && r.removeClass（“ open”）; t .clearTimeout（c）; s.addClass（“ open”）; i.trigger（a）} var i = e（this），s = i.parent（），o = {delay：500，instantlyCloseOthers：！0} ，u = {delay：e（this）.data（“ delay”），instantlyCloseOthers：e（this）.data（“ close-others”）}，a =“ show.bs.dropdown”，f =“隐藏。 bs.dropdown“，l = e.extend（！0，{}，o，n，u），c; s.hover（function（e）{if（！s.hasClass（” open“）&&！i。 is（e.target））return！0; h（e）}，function（）{c = t.setTimeout（function（）{s.removeClass（“ open”）; i.trigger（f）}，l。 delay）}）;; i.hover（function（e）{if（！s.hasClass（“ open”）&&！s.is（e。target））return！0; h（e）}）; s.find（“。dropdown-submenu”）。each（function（）{var n = e（this），r; n.hover（function（）{ t.clearTimeout（r）; n.children（“。dropdown-menu”）。show（）; n.siblings（）。children（“。dropdown-menu”）。hide（）}，function（）{var e = n.children（“。dropdown-menu”）; r = t.setTimeout（function（）{e.hide（）}，l.delay）}）}}}}}}}）;; e（document）.ready（function （）{e（'[data-hover =“ dropdown”]'）。dropdownHover（）}）}）（jQuery，this）;]'）。dropdownHover（）}）}）（jQuery，this）;]'）。dropdownHover（）}）}）（jQuery，this）;