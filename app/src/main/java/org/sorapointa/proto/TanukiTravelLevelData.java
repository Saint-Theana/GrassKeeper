package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TanukiTravelLevelData {
    @Tag(tag=5) public Boolean isOpen = null;
    @Tag(tag=9) public Integer routeId = null;
    @Tag(tag=15) public Boolean isFinish = null;
}
