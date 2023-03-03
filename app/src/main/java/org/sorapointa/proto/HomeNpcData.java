package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeNpcData {
    @Tag(tag=14) public Integer avatarId = null;
    @Tag(tag=15) public Vector spawnPos = null;
    @Tag(tag=3) public Integer costumeId = null;
    @Tag(tag=13) public Vector spawnRot = null;
}
