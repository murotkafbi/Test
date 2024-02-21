import math;
import sys;


# Функция для вычисления расстояния от точки до окружности
        def dist(p, c, r):
        return math.sqrt((p[0] - c[0]) ** 2 + (p[1] - c[1]) ** 2)


        # Основная функция программы
        def main():
        # Считываем данные из файла с координатами окружности и радиусом
        center, radius = read_data_from_file(sys.argv[1])

        # Считываем координаты точек из файла
        points = read_point_coordinates(sys.argv[2])

        for point in points:
        # Вычисляем расстояние от точки до окружности
        distance = dist(point, center, radius)

        if distance < radius:
        print("1")
        elif distance == radius:
        print("0")
        else:
        print("-1")