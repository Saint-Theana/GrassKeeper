package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionDungeonAvatar {
    @Tag(tag=8) public Long avatarGuid = null;
    @Tag(tag=2) public Boolean isTrial = null;
}
