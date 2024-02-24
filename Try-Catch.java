
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from mpl_toolkits.mplot3d import Axes3D

# Assuming you have a Pima Indians Diabetes dataset CSV file
file_path = 'pima_indians_diabetes.csv'
df = pd.read_csv(file_path)
# Correlation matrix
correlation_matrix = df.corr()

# Heatmap for correlation
plt.figure(figsize=(10, 8))
sns.heatmap(correlation_matrix, annot=True, cmap='coolwarm', fmt=".2f")
plt.title("Correlation Matrix")
plt.show()

# Scatter plots for pairs of features
sns.pairplot(df, hue='Outcome')
plt.suptitle('Scatter Plots and Diagonal Distributions of Pima Indians Diabetes Dataset Features', y=1.02)
plt.show()
# Histograms for each feature
df.hist(figsize=(12, 8))
plt.suptitle('Histograms of Pima Indians Diabetes Dataset Features', y=1.02)
plt.show()
# Three-dimensional scatter plot
fig = plt.figure(figsize=(10, 8))
ax = fig.add_subplot(111, projection='3d')

ax.scatter(df['Glucose'], df['BMI'], df['Age'], c=df['Outcome'], marker='o')

ax.set_xlabel('Glucose')
ax.set_ylabel('BMI')
ax.set_zlabel('Age')

plt.title('Three-dimensional Scatter Plot with Outcome Color Coding')
plt.show()