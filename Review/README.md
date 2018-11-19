### 图复习目录

* 数据结构
	* 无向图、有向图、加权图，有向加权图
		* 邻接表 
		* 邻接矩阵
			* 缺点：无法表示平行边和自环
	* 符号图、有向符号图

* 图结构生成
	* 生成欧拉环
	* 生成欧拉路径

* 深搜、广搜
	* 无向图、加权图
	* 有向图、加权有向图
	* 深搜、广搜的区别

* 非递归深搜
	* 无向图、加权图
	* 有向图、加权有向图
	
* 计算连通分量
	* 并查集
		* `quick-find`
		* `quick-union`
		* 加权 `quick-union`
		* 路径压缩的加权 `quick-union`
	* 深搜 or 广搜
	
* 识别二分图
	* 深搜
	* 广搜 : 是识别二分图的优化方案
	
* 寻找环
	* 在无向图中寻找环
	* 在有向图中寻找环
		* 普通方案
		* 优化方案
	
* 寻找欧拉环、欧拉路径
	* 在无向图中寻找欧拉环
	* 在有向图中寻找欧拉环

* 拓扑排序
	* 普通方案 : 深搜的逆后序
	* 优化方案 : 逐个删除入度为 0 的顶点
	
* 计算强连通分量
	* `KosarajuSCC`
		* 实现
		* 证明
	* `TarjanSCC`
		* 实现
		* 原理

* 最小生成树算法
	* 切分定理
	* 最小生成树的贪心算法
	* 延时 `Prim` 算法 
		* 时间复杂度 `O(ElogE)`
		* 空间复杂度 `O(E)`
	* 即时 Prim 算法
		* 时间复杂度 `O(ElogV)`
		* 空间复杂度 `O(V)`
	* Kruskal 算法
		* 时间复杂度 `O(ElogE)`
		* 空间复杂度 `O(E)`
	* `Prim` 算法和 `Dijkstra` 算法的区别
	
* 最短路径
	* 最短路径的最优性条件
	* 通用最短路径算法
	* `Dijkstra` 算法 : 适用于没有负权重的边
	* `Acyclic` 算法 : 适用于无环图
	* `BellmanFord` 算法 : 适用于没有负权重环的图
	* `Dijkstra` 算法和 `BellmanFord` 算法的区别
	




	