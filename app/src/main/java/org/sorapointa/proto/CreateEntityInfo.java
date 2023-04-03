package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.CreateGadgetInfo.*;
import org.sorapointa.proto.CreateGadgetInfo;

public class CreateEntityInfo {
    @Tag(tag=1) public Integer monsterId = null;
    @Tag(tag=2) public Integer npcId = null;
    @Tag(tag=3) public Integer gadgetId = null;
    @Tag(tag=4) public Integer itemId = null;
    @Tag(tag=5) public Integer level = null;
    @Tag(tag=6) public Vector pos = null;
    @Tag(tag=7) public Vector rot = null;
    @Tag(tag=10) public Integer sceneId = null;
    @Tag(tag=11) public Integer roomId = null;
    @Tag(tag=12) public Integer clientUniqueId = null;
    @Tag(tag=13) public CreateGadgetInfo gadget = null;
}
