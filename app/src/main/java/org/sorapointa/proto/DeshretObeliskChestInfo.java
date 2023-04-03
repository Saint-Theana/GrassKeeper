package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class DeshretObeliskChestInfo {
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=13) public Integer configId = null;
    @Tag(tag=11) public Integer groupId = null;
    @Tag(tag=10) public Vector pos = null;
}
