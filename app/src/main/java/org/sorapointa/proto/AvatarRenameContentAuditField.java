package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarRenameAuditContent.*;
import org.sorapointa.proto.AvatarRenameAuditContent;

public class AvatarRenameContentAuditField {
    @Tag(tag=1) public List<AvatarRenameAuditContent> segmentList = new ArrayList<>();
    @Tag(tag=2) public String name = null;
}
