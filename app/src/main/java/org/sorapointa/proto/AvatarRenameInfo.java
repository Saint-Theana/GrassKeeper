package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarRenameInfo {
    @Tag(tag=1) public Integer avatarId = null;
    @Tag(tag=8) public String avatarName = null;
}
