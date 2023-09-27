package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{

    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM seller WHERE Id = ?");

            st.setInt(1, id);

            int rows = st.executeUpdate();

            if (rows == 0){
                throw new DbException("Id inexistente");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Department> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Department findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(Department obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Department obj) {
        // TODO Auto-generated method stub
        
    }
    
}
