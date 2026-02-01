// In the name of Allah, the Most Gracious, the Most Merciful
#include <stdio.h>

int main()
{
    int n, m;
    scanf("%d %d", &n, &m);
    int matrix1[n][m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            scanf("%d", &matrix1[i][j]);
        }
    }

    int k, l;
    scanf("%d %d", &k, &l);
    int matrix2[k][l];
    for (int i = 0; i < k; i++)
    {
        for (int j = 0; j < l; j++)
        {
            scanf("%d", &matrix2[i][j]);
        }
    }

    if (m == k)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < l; j++)
            {
                int value = 0;
                for (int x = 0; x < m; x++)
                {
                    value += matrix1[i][x] * matrix2[x][j];
                }
                printf("%d ", value);
            }
            printf("\n");
        }
    }
}