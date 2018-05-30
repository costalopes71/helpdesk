package br.com.sinapsisenergia.helpdesk.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.sinapsisenergia.helpdesk.dao.DownloadDAO;
import br.com.sinapsisenergia.helpdesk.entities.Download;

@Repository
public class DownloadDAOImpl extends GenericDAOImpl<Download, Integer> implements DownloadDAO {

}
