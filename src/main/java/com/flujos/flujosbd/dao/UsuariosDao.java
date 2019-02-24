package com.flujos.flujosbd.dao;

import com.flujos.flujosbd.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class UsuariosDao extends JdbcDaoSupport {

    @Autowired
    public UsuariosDao(DataSource dataSource1) {
        this.setDataSource(dataSource1);
    }


    public List<Usuario> findAll(){

        String sql = "SELECT a.usuario, b.fcnombre FROM usuarios a inner join ResponsablesFlujos b on a.usuario = b.FiNumEmpleado";

        List<Usuario> customers = new ArrayList<Usuario>();

        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
        for (Map row : rows) {
            Usuario usuario = new Usuario();
            usuario.setUsuario((Integer)(row.get("USUARIO")));
            usuario.setFcnombre((String)row.get("fcnombre"));
            customers.add(usuario);
        }

        return customers;
    }


    public void crearUsuario(Usuario usuario){

        String sql = "INSERT INTO usuarios " +
                "(NAME, PASSWORD) VALUES (?, ?)";

        getJdbcTemplate().update(sql, new Object[] { usuario.getUsuario(),
                usuario.getPassword()
        });

    }

}
