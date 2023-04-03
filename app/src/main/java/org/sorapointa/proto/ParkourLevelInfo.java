package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ParkourLevelInfo {
    @Tag(tag=10) public Integer openTime = null;
    @Tag(tag=5) public Vector pos = null;
    @Tag(tag=1) public Integer bestRecord = null;
    @Tag(tag=12) public Boolean isOpen = null;
}
