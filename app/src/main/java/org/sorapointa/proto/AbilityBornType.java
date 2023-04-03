package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityBornType {
    @Tag(tag=7) public Vector pos = null;
    @Tag(tag=12) public Vector moveDir = null;
    @Tag(tag=9) public Vector rot = null;
}
