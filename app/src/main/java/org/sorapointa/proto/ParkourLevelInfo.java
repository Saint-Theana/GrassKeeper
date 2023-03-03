package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ParkourLevelInfo {
    @Tag(tag=12) public Integer bestRecord = null;
    @Tag(tag=9) public Boolean isOpen = null;
    @Tag(tag=7) public Integer openTime = null;
    @Tag(tag=2) public Vector pos = null;
}
