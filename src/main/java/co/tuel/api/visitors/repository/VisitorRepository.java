/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.tuel.api.visitors.repository;

import co.tuel.api.visitors.model.Visitor;
import co.tuel.gcp.repository.GCPRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author juan.herrera
 */
@Service
public class VisitorRepository extends GCPRepository<Visitor, Long>{
    
}
