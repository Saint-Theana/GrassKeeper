package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class DeshretObeliskChestInfo {
    @Tag(tag=5) public Integer sceneId = null;
    @Tag(tag=9) public Vector pos = null;
    @Tag(tag=7) public Integer groupId = null;
    @Tag(tag=3) public Integer configId = null;
}
