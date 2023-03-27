package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarTeam {
    @Tag(tag=11) public String teamName = null;
    @Tag(tag=5) public List<Long> avatarGuidList = new ArrayList<>();
}
