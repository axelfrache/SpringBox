package io.github.axelfrache.springbox.repository;

import io.github.axelfrache.springbox.model.Folder;
import io.github.axelfrache.springbox.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findByUser(User user);
    List<Folder> findByParentFolder(Folder parentFolder);
    List<Folder> findByUserAndParentFolderIsNull(User user);
}
