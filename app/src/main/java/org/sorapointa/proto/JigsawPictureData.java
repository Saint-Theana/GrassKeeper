package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class JigsawPictureData {
    @Tag(tag=7) public Boolean isFinished = null;
    @Tag(tag=10) public Integer shortestTime = null;
    @Tag(tag=5) public Boolean isOpen = null;
    @Tag(tag=6) public Integer lastDuration = null;
}
