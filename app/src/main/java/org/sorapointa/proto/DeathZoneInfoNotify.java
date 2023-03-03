package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DeathZoneInfo.*;
import org.sorapointa.proto.DeathZoneInfo;

public class DeathZoneInfoNotify {
    @Tag(tag=8) public List<DeathZoneInfo> deathZoneInfoList = new ArrayList<>();
}
