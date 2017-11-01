package com.netcracker.zagursky.dao;

import com.netcracker.zagursky.connection.ConnectionDB;
import com.netcracker.zagursky.entity.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DefaultCourseDao implements CourseDao {
    private final String GET_COURSES = "SELECT id, name, trenerName, trenerLastName, hour FROM course";
    private final String GET_COURSE_ID = "SELECT id, name, trenerName, trenerLastName, hour FROM course WHERE id=?";
    private final String INSERT_COURSE = "INSERT INTO course (id,name,trenerName,trenerLastName,hour) VALUES (?,?,?,?,?)";
    private final String UPDATE_COURSE = " UPDATE COURSE SET name =?, trenerName = ?, trenerLastName=?,hour=? WHERE id=?";
    private final String DELETE_COURSE = "DELETE FROM course WHERE id=?";


    private ConnectionDB connectionDB = ConnectionDB.getInstance();

    private DefaultCourseDao() {
    }

    public static DefaultCourseDao getInstance() {
        return Holder.INSTANCE;
    }

    public List<Course> getCourses() {
        List<Course> courses = new ArrayList();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionDB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(GET_COURSES);
            while (resultSet.next()) {
                Course course = new Course(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5));
                courses.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return courses;
    }

    public Course getCourseById(int id) {
        Course course = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionDB.getConnection();
            preparedStatement = connection.prepareStatement(GET_COURSE_ID);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                course = new Course(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return course;

    }

    public void addCourse(Course course) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionDB.getConnection();
            preparedStatement = connection.prepareStatement(INSERT_COURSE);
            preparedStatement.setInt(1, course.getId());
            preparedStatement.setString(2, course.getName());
            preparedStatement.setString(3, course.getTrenerName());
            preparedStatement.setString(4, course.getTrenerLastName());
            preparedStatement.setInt(5, course.getHour());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void update(Course course) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionDB.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_COURSE);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getTrenerName());
            preparedStatement.setString(3,course.getTrenerLastName());
            preparedStatement.setInt(4, course.getHour());
            preparedStatement.setInt(5, course.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public void delete(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionDB.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_COURSE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    private static class Holder {
        private final static DefaultCourseDao INSTANCE = new DefaultCourseDao();
    }
}
