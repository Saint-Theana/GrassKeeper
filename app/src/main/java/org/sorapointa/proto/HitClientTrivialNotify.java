package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HitClientTrivialNotify {
    @Tag(tag=11) public Vector position = null;
    @Tag(tag=12) public Integer ownerEntityId = null;
}
