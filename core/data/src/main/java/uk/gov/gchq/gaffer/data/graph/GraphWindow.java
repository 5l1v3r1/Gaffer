/*
 * Copyright 2017-2020 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.gchq.gaffer.data.graph;

import uk.gov.gchq.gaffer.data.graph.adjacency.AdjacencyMaps;
import uk.gov.gchq.gaffer.data.graph.entity.EntityMaps;

/**
 * A {@code GraphWindow} is an immutable in-memory representation of a graph.
 *
 * A GraphWindow can be used to create a graph representation which tracks changes to
 * a graph, for example temporal changes or different views on a parent graph seen
 * during a Walk.
 */
public class GraphWindow {

    private final AdjacencyMaps adjacencyMaps;
    private final EntityMaps entityMaps;

    /**
     * Default constructor.
     *
     * @param adjacencyMaps the adjacency maps to set
     * @param entityMaps the entity maps to set
     */
    public GraphWindow(final AdjacencyMaps adjacencyMaps, final EntityMaps entityMaps) {
        this.adjacencyMaps = adjacencyMaps;
        this.entityMaps = entityMaps;
    }

    /**
     * Get the adjacency maps.
     *
     * @return the adjacency maps
     */
    public AdjacencyMaps getAdjacencyMaps() {
        return adjacencyMaps;
    }

    /**
     * Get the entity maps.
     *
     * @return the entity maps
     */
    public EntityMaps getEntityMaps() {
        return entityMaps;
    }
}
