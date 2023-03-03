package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityDungeonAvatar {
    @Tag(tag=1) public Integer avatarId = null;
    @Tag(tag=2) public Boolean isTrial = null;
    @Tag(tag=3) public Integer costumeId = null;
}
