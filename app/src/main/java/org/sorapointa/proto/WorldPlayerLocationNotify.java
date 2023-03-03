package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerLocationInfo.*;
import org.sorapointa.proto.PlayerLocationInfo;
import org.sorapointa.proto.PlayerWorldLocationInfo.*;
import org.sorapointa.proto.PlayerWorldLocationInfo;

public class WorldPlayerLocationNotify {
    @Tag(tag=8) public List<PlayerWorldLocationInfo> playerWorldLocList = new ArrayList<>();
    @Tag(tag=15) public List<PlayerLocationInfo> playerLocList = new ArrayList<>();
}
