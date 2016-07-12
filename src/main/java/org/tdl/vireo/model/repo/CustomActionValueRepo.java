package org.tdl.vireo.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tdl.vireo.model.CustomActionDefinition;
import org.tdl.vireo.model.CustomActionValue;
import org.tdl.vireo.model.Submission;
import org.tdl.vireo.model.repo.custom.CustomActionValueRepoCustom;

public interface CustomActionValueRepo extends JpaRepository<CustomActionValue, Long>, CustomActionValueRepoCustom {

    public CustomActionValue findBySubmissionAndDefinition(Submission submission, CustomActionDefinition customActionDefinition);

}