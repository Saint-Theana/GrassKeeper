package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TanukiTravelLevelData {
    @Tag(tag=2) public Boolean isFinish = null;
    @Tag(tag=1) public Integer routeId = null;
    @Tag(tag=8) public Boolean isOpen = null;
}
