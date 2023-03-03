package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerLocationInfo.*;
import org.sorapointa.proto.PlayerLocationInfo;

public class PlayerWorldLocationInfo {
    @Tag(tag=1) public Integer sceneId = null;
    @Tag(tag=12) public PlayerLocationInfo playerLoc = null;
}
