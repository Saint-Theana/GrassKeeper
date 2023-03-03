package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityBornType {
    @Tag(tag=2) public Vector rot = null;
    @Tag(tag=14) public Vector moveDir = null;
    @Tag(tag=5) public Vector pos = null;
}
