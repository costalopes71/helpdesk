package br.com.sinapsisenergia.helpdesk.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.sinapsisenergia.helpdesk.dao.FaqDAO;
import br.com.sinapsisenergia.helpdesk.entities.FAQ;

@Repository
public class FaqDAOImpl extends GenericDAOImpl<FAQ, Integer> implements FaqDAO {

}
