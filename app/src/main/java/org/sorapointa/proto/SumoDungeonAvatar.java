package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoDungeonAvatar {
    @Tag(tag=11) public Long avatarGuid = null;
    @Tag(tag=13) public Boolean isAlive = null;
    @Tag(tag=4) public Boolean isTrial = null;
}
