package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoDungeonAvatar {
    @Tag(tag=10) public Boolean isAvlive = null;
    @Tag(tag=5) public Boolean isTrial = null;
    @Tag(tag=3) public Long avatarGuid = null;
}
