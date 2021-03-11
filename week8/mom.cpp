#include <iostream>
#include <stdio.h>
#include <vector>
#include <iterator>
using namespace std;

vector<bool> visited; 
vector<vector<int> > graph; 
int sz_connect_comp = 0; 

void dfs(int v)
{
        sz_connect_comp++; 
        visited[v] = true;
        
        for(vector<int>::iterator it = graph[v].begin(); it != graph[v].end(); it++)
        {
                if(! visited[*it])
                {
                        dfs(*it);
                }
        }
}

int main()
{
        int t;
        cin >> t;
        while(t--)
        {
                int n,m;
                cin >> n >> m;
                graph = vector<vector<int> > (n); 
                for(int i = 0; i < m; i++)
                {
                        int u,v;
                        cin >> u >> v;
                        u--;
                        v--;
                        
                        graph[u].push_back(v);
                        graph[v].push_back(u);
                }
                int res = 0; // the number of fire escape routes
                int ways = 1; 
                visited = vector<bool> (n, 0); 
                for(int u = 0; u < n; u++)
                {
                        if(visited[u]==true)
                                continue;
                        res++; 
                        sz_connect_comp = 0; 
                        dfs(u); 
                        ways = (long long)sz_connect_comp * ways % 1000000002;
                }
                printf("%d %d\n", res, ways);
                        
        }
        return 0;
}
