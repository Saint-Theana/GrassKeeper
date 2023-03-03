package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarTeam {
    @Tag(tag=7) public List<Long> avatarGuidList = new ArrayList<>();
    @Tag(tag=14) public String teamName = null;
}
