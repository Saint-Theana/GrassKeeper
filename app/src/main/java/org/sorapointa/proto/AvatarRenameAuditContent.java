package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarRenameAuditContent {
    @Tag(tag=1) public String type = null;
    @Tag(tag=2) public String content = null;
    @Tag(tag=3) public Integer autoFailTime = null;
}
