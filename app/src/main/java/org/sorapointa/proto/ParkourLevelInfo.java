package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ParkourLevelInfo {
    @Tag(tag=10) public Integer openTime = null;
    @Tag(tag=5) public Vector pos = null;
    @Tag(tag=1) public Integer bestRecord = null;
    @Tag(tag=12) public Boolean isOpen = null;
}
