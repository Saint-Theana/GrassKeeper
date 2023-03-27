package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class JigsawPictureData {
    @Tag(tag=12) public Integer shortestTime = null;
    @Tag(tag=11) public Integer lastDuration = null;
    @Tag(tag=4) public Boolean isOpen = null;
    @Tag(tag=8) public Boolean isFinished = null;
}
