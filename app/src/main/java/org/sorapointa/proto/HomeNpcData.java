package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeNpcData {
    @Tag(tag=4) public Vector spawnPos = null;
    @Tag(tag=13) public Integer costumeId = null;
    @Tag(tag=5) public Integer avatarId = null;
    @Tag(tag=6) public Vector spawnRot = null;
}
